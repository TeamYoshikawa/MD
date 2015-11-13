/*
* ページ移動のやりかたメモ
*①必要なアクティビティを追加する
*　app > java(左クリック) > new > Activity
*
*②アクティビティを追加したらAndroidManifestの変更を忘れずに
*           ↓今回追加した部分↓
* 　　　　　<intent-filter>
                <action android:name="android.intent.action.MAIN" />　　//ページ移動の際に必要なコマンド
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
　　　  <activity>
        android:name=".ActivitySecond"
        android:label="@string/title_activity_activity_second"
        android:theme="@style/AppTheme.NoActionBar" >
        </activity>
*
*③ボタンを追加する
*activity_firstのText(下のほうにある)を選択
* 記述としてはこんな感じ
* 　　　　　<Button
            android:id="@+id/btnToSecond"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="onClick"
            android:text="ldl_btnToSecond"
            />
*
* イメージボタンの場合(drawableに画像を"拡張子含めすべて小文字で"ctrl+c & ctrl+vでぶち込んでおいてください)
*一例
             <ImageButton
            android:id="@+id/b6" //idを登録
            android:layout_width="100dp"　//サイズwidth
            android:layout_height="100dp"　//サイズheight
            android:layout_gravity="center_horizontal"  //gravity属性(とりあえず中央寄せ、いろいろあるよ）
            android:src="@drawable/b6" //参照元と画像を選択
            android:onClick="b6"　　//メソッド
            android:layout_below="@+id/b2"　
            android:layout_alignParentLeft="true"  //drag & dropでポジションが動かせる
            android:layout_alignParentStart="true"　 //drag & dropでポジションが動かせる
             />
          </RelativeLayout>
*
*④プログラムを記述する
*基本的には必要クラスをimportしてOnClickメソッドを追加するだけ
* OnClickメソッドには移動先クラスのintentを作成してアクティビティの開始を実行している。
*
* */