.class LY6/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY6/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;Ljava/util/Set;LY6/r;)LY6/h;
    .locals 1

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_1

    sget-object p1, LY6/t;->b:LY6/h;

    return-object p1

    :cond_1
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_2

    sget-object p1, LY6/t;->c:LY6/h;

    return-object p1

    :cond_2
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_3

    sget-object p1, LY6/t;->d:LY6/h;

    return-object p1

    :cond_3
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_4

    sget-object p1, LY6/t;->e:LY6/h;

    return-object p1

    :cond_4
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_5

    sget-object p1, LY6/t;->f:LY6/h;

    return-object p1

    :cond_5
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_6

    sget-object p1, LY6/t;->g:LY6/h;

    return-object p1

    :cond_6
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_7

    sget-object p1, LY6/t;->h:LY6/h;

    return-object p1

    :cond_7
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_8

    sget-object p1, LY6/t;->i:LY6/h;

    return-object p1

    :cond_8
    const-class p2, Ljava/lang/Boolean;

    if-ne p1, p2, :cond_9

    sget-object p1, LY6/t;->b:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_9
    const-class p2, Ljava/lang/Byte;

    if-ne p1, p2, :cond_a

    sget-object p1, LY6/t;->c:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_a
    const-class p2, Ljava/lang/Character;

    if-ne p1, p2, :cond_b

    sget-object p1, LY6/t;->d:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_b
    const-class p2, Ljava/lang/Double;

    if-ne p1, p2, :cond_c

    sget-object p1, LY6/t;->e:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_c
    const-class p2, Ljava/lang/Float;

    if-ne p1, p2, :cond_d

    sget-object p1, LY6/t;->f:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_d
    const-class p2, Ljava/lang/Integer;

    if-ne p1, p2, :cond_e

    sget-object p1, LY6/t;->g:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_e
    const-class p2, Ljava/lang/Long;

    if-ne p1, p2, :cond_f

    sget-object p1, LY6/t;->h:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_f
    const-class p2, Ljava/lang/Short;

    if-ne p1, p2, :cond_10

    sget-object p1, LY6/t;->i:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_10
    const-class p2, Ljava/lang/String;

    if-ne p1, p2, :cond_11

    sget-object p1, LY6/t;->j:LY6/h;

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_11
    const-class p2, Ljava/lang/Object;

    if-ne p1, p2, :cond_12

    new-instance p1, LY6/t$m;

    invoke-direct {p1, p3}, LY6/t$m;-><init>(LY6/r;)V

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_12
    invoke-static {p1}, LY6/v;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3, p1, p2}, La7/c;->d(LY6/r;Ljava/lang/reflect/Type;Ljava/lang/Class;)LY6/h;

    move-result-object p1

    if-eqz p1, :cond_13

    return-object p1

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_14

    new-instance p1, LY6/t$l;

    invoke-direct {p1, p2}, LY6/t$l;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p1}, LY6/h;->g()LY6/h;

    move-result-object p1

    return-object p1

    :cond_14
    return-object v0
.end method
