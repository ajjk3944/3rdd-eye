.class public final LSh/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSh/h$a;->f(LZh/f;LZh/b;)LSh/x$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LSh/x$a;

.field final synthetic b:LSh/x$a;

.field final synthetic c:LSh/h$a;

.field final synthetic d:LZh/f;

.field final synthetic e:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(LSh/x$a;LSh/h$a;LZh/f;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, LSh/h$a$a;->b:LSh/x$a;

    iput-object p2, p0, LSh/h$a$a;->c:LSh/h$a;

    iput-object p3, p0, LSh/h$a$a;->d:LZh/f;

    iput-object p4, p0, LSh/h$a$a;->e:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh/h$a$a;->a:LSh/x$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, LSh/h$a$a;->b:LSh/x$a;

    invoke-interface {v0}, LSh/x$a;->a()V

    iget-object v0, p0, LSh/h$a$a;->c:LSh/h$a;

    iget-object v1, p0, LSh/h$a$a;->d:LZh/f;

    new-instance v2, Ldi/a;

    iget-object v3, p0, LSh/h$a$a;->e:Ljava/util/ArrayList;

    invoke-static {v3}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    invoke-direct {v2, v3}, Ldi/a;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)V

    invoke-virtual {v0, v1, v2}, LSh/h$a;->h(LZh/f;Ldi/g;)V

    return-void
.end method

.method public b(LZh/f;Ldi/f;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h$a$a;->a:LSh/x$a;

    invoke-interface {v0, p1, p2}, LSh/x$a;->b(LZh/f;Ldi/f;)V

    return-void
.end method

.method public c(LZh/f;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LSh/h$a$a;->a:LSh/x$a;

    invoke-interface {v0, p1, p2}, LSh/x$a;->c(LZh/f;Ljava/lang/Object;)V

    return-void
.end method

.method public d(LZh/f;)LSh/x$b;
    .locals 1

    iget-object v0, p0, LSh/h$a$a;->a:LSh/x$a;

    invoke-interface {v0, p1}, LSh/x$a;->d(LZh/f;)LSh/x$b;

    move-result-object p1

    return-object p1
.end method

.method public e(LZh/f;LZh/b;LZh/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h$a$a;->a:LSh/x$a;

    invoke-interface {v0, p1, p2, p3}, LSh/x$a;->e(LZh/f;LZh/b;LZh/f;)V

    return-void
.end method

.method public f(LZh/f;LZh/b;)LSh/x$a;
    .locals 1

    const-string v0, "classId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h$a$a;->a:LSh/x$a;

    invoke-interface {v0, p1, p2}, LSh/x$a;->f(LZh/f;LZh/b;)LSh/x$a;

    move-result-object p1

    return-object p1
.end method
