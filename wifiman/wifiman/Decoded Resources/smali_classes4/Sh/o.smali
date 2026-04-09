.class public final LSh/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/j;


# instance fields
.field private final a:LSh/v;

.field private final b:LSh/n;


# direct methods
.method public constructor <init>(LSh/v;LSh/n;)V
    .locals 1

    const-string v0, "kotlinClassFinder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh/o;->a:LSh/v;

    iput-object p2, p0, LSh/o;->b:LSh/n;

    return-void
.end method


# virtual methods
.method public a(LZh/b;)Lli/i;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/o;->a:LSh/v;

    iget-object v1, p0, LSh/o;->b:LSh/n;

    invoke-virtual {v1}, LSh/n;->f()Lli/n;

    move-result-object v1

    invoke-virtual {v1}, Lli/n;->g()Lli/o;

    move-result-object v1

    invoke-static {v1}, Lxi/c;->a(Lli/o;)LYh/e;

    move-result-object v1

    invoke-static {v0, p1, v1}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0}, LSh/x;->b()LZh/b;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, LSh/o;->b:LSh/n;

    invoke-virtual {p1, v0}, LSh/n;->l(LSh/x;)Lli/i;

    move-result-object p1

    return-object p1
.end method
