package com.example.controledeprodutos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.MyViewHolder> {

    private List<Produto> produtoList;
    private OnClick onClick;

    public AdapterProduto(List<Produto> produtoList, OnClick onClick) {
        this.produtoList = produtoList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produto, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Produto produto = produtoList.get(position);

        holder.text_produto.setText(produto.getNome());
        holder.text_estoque.setText("Estoque: " + produto.getEstoque());
        holder.text_preco.setText("R$: " + produto.getValor());

        holder.itemView.setOnClickListener(view -> onClick.onClickListener(produto));

    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

    public interface OnClick{
        void onClickListener(Produto produto);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text_produto, text_preco, text_estoque;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text_produto = itemView.findViewById(R.id.text_produto);
            text_estoque = itemView.findViewById(R.id.text_estoque);
            text_preco = itemView.findViewById(R.id.text_preco);
        }
    }
}
