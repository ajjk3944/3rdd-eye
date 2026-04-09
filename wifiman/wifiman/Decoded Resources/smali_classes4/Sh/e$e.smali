.class public final LSh/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSh/e;->a(Lli/N$a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LSh/e;

.field final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(LSh/e;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, LSh/e$e;->a:LSh/e;

    iput-object p2, p0, LSh/e$e;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(LZh/b;LBh/g0;)LSh/x$a;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/e$e;->a:LSh/e;

    iget-object v1, p0, LSh/e$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2, v1}, LSh/e;->y(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p1

    return-object p1
.end method
