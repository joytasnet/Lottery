# 宝くじ

## 仕様
宝くじとして連番で0 - 100までが存在している。

## 実行例
何枚>>5  
[32,5,83,42,9]  
当選番号:45  
はずれ  

## 作成方針

1. 0-100の番号が入ったint型配列(lotts)を作る
1. 配列をシャッフル
1. 枚数を聞く
1. 入力された枚数でint型配列(myLotts)を作成
1. シャッフルされた配列の先頭から枚数分取り出してmyLottsに格納
1. 当選番号を抽選（0-100 )
1. もしmyLottsの中に当選番号があればあたり、そうでなければはずれと出力する

