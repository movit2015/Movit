
CREATE TABLE Member (
    memberIdx int not null primary key, /*auto increase ���� �� ã�ƺ���*/
    m_id varchar(80) not null,
    m_pw varchar(80) not null,
    m_name varchar(80) null,
    m_rateAvg float null, 
    m_commonRate float null, 
    m_totalRate float null, 
    m_totalTime int null
);

create table StorageMv (
    memberIdx int REFERENCES Member(memberIdx), 
    s_storageIdx int not null primary key,
    s_title varchar(80) not null,
	s_director varchar(80) not null,
	s_img varchar(80),
	s_nation varchar(80),
	s_time varchar(80),
    s_rating varchar(80),
    s_pubYear varchar(80),
    s_actor varchar(80),
    s_genre varchar(80)
    );

drop table StorageMv;

insert into StorageMv (s_storageIdx, memberIdx, s_title, s_director, s_img, s_nation, s_time, s_rating, s_pubYear, s_actor, s_genre) values (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

/*grant all on supplier to public;*/

create table WishMv (
	memberIdx int not null references Member(memberIdx),
	wishIdx int not null primary key,
	w_title varchar(80) not null,
	w_director varchar(80) not null,
	w_img varchar(80)
	);

/* constraint pk_signon primary key (username) */
/*grant all on signon to public;*/



    
    



/*    constraint pk_account primary key (userid)*/
/*grant all on account to public;*/

create table TasteGenre (
    g_tasteIdx int not null primary key,
    memberIdx int REFERENCES Member(memberIdx),
    g_drama int,
    g_romance int,
    g_action int,
    g_horror int,
    g_adventure int,
    g_sf int,
    g_thriller int,
    g_comedy int,
    g_family int, 
    g_noir int, 
    g_animation int, 
    g_fantasy int, 
    g_war int, 
    g_docu int   
);


/* constraint pk_profile primary key (userid)*/

/*grant all on profile to public;


create table bannerdata (
    favcategory varchar(80) not null,
    bannername varchar(255)  null,
    constraint pk_bannerdata primary key (favcategory)
);

grant all on bannerdata to public;

create table orders (
      orderid int not null,
      userid varchar(80) not null,
      orderdate date not null,
      shipaddr1 varchar(80) not null,
      shipaddr2 varchar(80) null,
      shipcity varchar(80) not null,
      shipstate varchar(80) not null,
      shipzip varchar(20) not null,
      shipcountry varchar(20) not null,
      billaddr1 varchar(80) not null,
      billaddr2 varchar(80)  null,
      billcity varchar(80) not null,
      billstate varchar(80) not null,
      billzip varchar(20) not null,
      billcountry varchar(20) not null,
      courier varchar(80) not null,
      totalprice number(10,2) not null,
      billtofirstname varchar(80) not null,
      billtolastname varchar(80) not null,
      shiptofirstname varchar(80) not null,
      shiptolastname varchar(80) not null,
      creditcard varchar(80) not null,
      exprdate varchar(7) not null,
      cardtype varchar(80) not null,
      locale varchar(80) not null,
      constraint pk_orders primary key (orderid),
      constraint fk_orders_1 foreign key (userid)
	references account (userid)
);

create sequence ordernum increment by 1 cache 10000;

grant all on orders to public;

create table orderstatus (
      orderid int not null,
      linenum int not null,
      timestamp date not null,
      status varchar(2) not null,
      constraint pk_orderstatus primary key (orderid, linenum),
      constraint fk_orderstatus_1 foreign key (orderid)
	references orders (orderid)
);

grant all on orderstatus to public;
create sequence linenum increment by 1 cache 10000;

create table category (
	catid varchar(10) not null,
	name varchar(80) null,
	descn varchar(255) null,
	constraint pk_category primary key (catid)
);

grant all on category to public;

create table product (
    productid varchar(10) not null,
    category varchar(10) not null,
    name varchar(80) null,
    descn varchar(255) null,
    constraint pk_product primary key (productid),
        constraint fk_product_1 foreign key (category)
        references category (catid)
);

grant all on product to public;
create index productCat on product (category);
create index productName on product (name);

create table item (
    itemid varchar(10) not null,
    productid varchar(10) not null,
    listprice decimal(10,2) null,
    unitcost decimal(10,2) null,
    supplier int null,
    status varchar(2) null,
    attr1 varchar(80) null,
    attr2 varchar(80) null,
    attr3 varchar(80) null,
    attr4 varchar(80) null,
    attr5 varchar(80) null,
    constraint pk_item primary key (itemid),
        constraint fk_item_1 foreign key (productid)
        references product (productid),
        constraint fk_item_2 foreign key (supplier)
        references supplier (suppid)
);

grant all on item to public;
create index itemProd on item (productid);

create table inventory (
    itemid varchar(10) not null,
    qty int not null,
    constraint pk_inventory primary key (itemid)
);

grant all on inventory to public;

create table lineitem (
      orderid int not null,
      linenum int not null,
      itemid varchar(10) not null,
      quantity int not null,
      unitprice number(10,2) not null,
      constraint pk_lineitem primary key (orderid, linenum),
      constraint fk_lineitem_1 foreign key (orderid)
	references orders (orderid)
);

grant all on lineitem to public;

create table sequence (
    name varchar(30) not null,
    nextid int not null,
    constraint pk_sequence primary key (name)
);

grant all on sequence to public;*/
