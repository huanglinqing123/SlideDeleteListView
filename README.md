# SlideDeleteListView
ListView侧滑删除

#### 效果图：
  ![image](http://pdqk4k9f6.bkt.clouddn.com/delete.png)

#### maven：
     <dependency>
       <groupId>com.hlq</groupId>
       <artifactId>slideDeleteListView</artifactId>
       <version>1.0.0</version>
       <type>pom</type>
     </dependency>

#### Gradle：
     compile 'com.hlq:slideDeleteListView:1.0.0'
     
#### 布局中：
       <hlq.com.slidedeletelistview.SlideDeleteListView
             android:id="@+id/listview"
             android:layout_width="match_parent"
             android:layout_height="match_parent"/>
       其他属性和普通listview使用方法一致
       
#### Java代码：
      slideDeleteListView.setBtnDelClickListener(new BtnDeleteListern() {
                  @Override
                  public void deleteOnCliclListern(int positon) {
                      Toast.makeText(MainActivity.this, "点击的是第" + positon + "项", Toast.LENGTH_SHORT).show();
                  }
              });
#### github地址：
      https://github.com/huanglinqing123/SlideDeleteListView
      
#### 欢迎start和insue
