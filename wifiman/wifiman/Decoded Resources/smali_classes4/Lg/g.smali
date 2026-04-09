.class public LLg/g;
.super LLg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLg/g$c;,
        LLg/g$d;,
        LLg/g$b;,
        LLg/g$e;,
        LLg/g$f;,
        LLg/g$g;,
        LLg/g$h;
    }
.end annotation


# static fields
.field private static h:LEj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LLg/g;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LLg/g;->h:LEj/b;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LLg/b;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-void
.end method

.method public static D(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)LLg/g;
    .locals 2

    sget-object v0, LLg/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, LLg/g;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_0
    new-instance v0, LLg/g$h;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$h;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_1
    new-instance v0, LLg/g$g;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$g;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_2
    new-instance v0, LLg/g$f;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$f;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_3
    new-instance v0, LLg/g$e;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$e;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_4
    new-instance v0, LLg/g$b;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$b;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_5
    new-instance v0, LLg/g$d;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$d;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_6
    new-instance v0, LLg/g$d;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$d;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    :pswitch_7
    new-instance v0, LLg/g$c;

    invoke-direct {v0, p0, p1, p2, p3}, LLg/g$c;-><init>(Ljava/lang/String;Ljavax/jmdns/impl/constants/e;Ljavax/jmdns/impl/constants/d;Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected A(LLg/l;Ljava/util/Set;LLg/q;)V
    .locals 4

    if-eqz p3, :cond_2

    invoke-virtual {p3}, LLg/q;->Z()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, LLg/q;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, LLg/q;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, LLg/q;->U()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v0

    invoke-virtual {p0}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v1

    sget v2, Ljavax/jmdns/impl/constants/a;->d:I

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, LLg/k;->a(Ljavax/jmdns/impl/constants/d;ZI)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, LLg/b;->f()Ljavax/jmdns/impl/constants/d;

    move-result-object v0

    invoke-virtual {p1}, LLg/l;->F0()LLg/k;

    move-result-object v1

    invoke-virtual {p3, v0, v3, v2, v1}, LLg/q;->K(Ljavax/jmdns/impl/constants/d;ZILLg/k;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    sget-object v0, LLg/g;->h:LEj/b;

    invoke-virtual {p1}, LLg/l;->G0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p1, v1, p3, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}"

    invoke-interface {v0, p2, p1}, LEj/b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method B(LLg/b;)Z
    .locals 1

    invoke-virtual {p0, p1}, LLg/b;->n(LLg/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LLg/b;->o(LLg/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLg/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LLg/b;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public C(LLg/l;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public k(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public y(Ljava/lang/StringBuilder;)V
    .locals 0

    return-void
.end method

.method public z(LLg/l;Ljava/util/Set;)V
    .locals 0

    return-void
.end method
