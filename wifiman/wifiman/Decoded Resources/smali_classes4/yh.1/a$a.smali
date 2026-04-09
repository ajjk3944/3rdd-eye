.class public final Lyh/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyh/a;->c(LSh/x;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;)V
    .locals 0

    iput-object p1, p0, Lyh/a$a;->a:Lkotlin/jvm/internal/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(LZh/b;LBh/g0;)LSh/x$a;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, LJh/H;->a:LJh/H;

    invoke-virtual {p2}, LJh/H;->a()LZh/b;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lyh/a$a;->a:Lkotlin/jvm/internal/J;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lkotlin/jvm/internal/J;->a:Z

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
