package br.com.alura.screematch.model;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
