.class public final LB7/a;
.super LA7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB7/a$a;
    }
.end annotation


# static fields
.field public static final c:LB7/a$a;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LB7/a;->c:LB7/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LA7/a;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, LB7/a;->a:I

    iput v0, p0, LB7/a;->b:I

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LB7/a;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LB7/a;->a:I

    return v0
.end method

.method public e(Ljava/util/List;)Ls7/c;
    .locals 2

    const-string/jumbo v0, "extras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls7/c;->c:Ls7/c$b;

    new-instance v1, LB7/a$b;

    invoke-direct {v1, p1}, LB7/a$b;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ls7/c$b;->a(Lmh/l;)Ls7/c;

    move-result-object p1

    return-object p1
.end method

.method public f(LA7/c;LA7/b;[B)Ls7/h;
    .locals 1

    const-string/jumbo v0, "packetHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "fieldHeader"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "data"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LA7/b;->b()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x5

    if-eq p1, v0, :cond_4

    const/16 v0, 0xe

    if-eq p1, v0, :cond_3

    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;

    invoke-virtual {p2}, LA7/b;->b()I

    move-result p2

    invoke-direct {p1, p2}, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;-><init>(I)V

    throw p1

    :pswitch_0
    new-instance p1, Ly7/e;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/e;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    new-instance p1, Ly7/i;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/i;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    new-instance p1, Lt7/g;

    sget-object p2, Lv7/b;->a:Lv7/b;

    sget-object v0, Lv7/a;->LITTLE_ENDIAN:Lv7/a;

    invoke-virtual {p2, p3, v0}, Lv7/b;->b([BLv7/a;)I

    move-result p2

    int-to-long p2, p2

    invoke-direct {p1, p2, p3}, Lt7/g;-><init>(J)V

    goto :goto_0

    :cond_0
    new-instance p1, Ly7/h;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/h;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ly7/k;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/k;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p1, Ly7/g;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/g;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ly7/j;

    sget-object p2, Lv7/b;->a:Lv7/b;

    sget-object v0, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {p2, p3, v0}, Lv7/b;->a([BLv7/a;)Z

    move-result p2

    invoke-direct {p1, p2}, Ly7/j;-><init>(Z)V

    goto :goto_0

    :cond_4
    new-instance p1, Ly7/f;

    new-instance p2, Ljava/lang/String;

    sget-object v0, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p2, p3, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p1, p2}, Ly7/f;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    new-instance p1, Lt7/d;

    invoke-direct {p1, p3}, Lt7/d;-><init>([B)V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g([BII)LA7/b;
    .locals 3

    const-string/jumbo p3, "data"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lv7/b;->a:Lv7/b;

    add-int/lit8 v0, p2, 0x2

    invoke-static {p1, p2, v0}, LZg/n;->r([BII)[B

    move-result-object v1

    sget-object v2, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {p3, v1, v2}, Lv7/b;->b([BLv7/a;)I

    move-result v1

    add-int/lit8 p2, p2, 0x4

    invoke-static {p1, v0, p2}, LZg/n;->r([BII)[B

    move-result-object p1

    invoke-virtual {p3, p1, v2}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    new-instance p2, LA7/b;

    invoke-direct {p2, v1, p1}, LA7/b;-><init>(II)V

    return-object p2
.end method

.method public h([BII)LA7/c;
    .locals 3

    const-string/jumbo p3, "data"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p3, p2, 0x1

    aget-byte p3, p1, p3

    sget-object v0, Lv7/b;->a:Lv7/b;

    add-int/lit8 v1, p2, 0x2

    add-int/lit8 v2, p2, 0x4

    invoke-static {p1, v1, v2}, LZg/n;->r([BII)[B

    move-result-object v1

    sget-object v2, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v0, v1, v2}, Lv7/b;->b([BLv7/a;)I

    move-result v0

    new-instance v1, LA7/c;

    aget-byte p1, p1, p2

    if-nez p3, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-direct {v1, p1, p2, v0}, LA7/c;-><init>(IZI)V

    return-object v1
.end method
