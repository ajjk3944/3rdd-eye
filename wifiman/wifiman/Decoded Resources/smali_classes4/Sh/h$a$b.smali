.class public final LSh/h$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSh/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSh/h$a;->d(LZh/f;)LSh/x$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;

.field final synthetic b:LSh/h;

.field final synthetic c:LZh/f;

.field final synthetic d:LSh/h$a;


# direct methods
.method constructor <init>(LSh/h;LZh/f;LSh/h$a;)V
    .locals 0

    iput-object p1, p0, LSh/h$a$b;->b:LSh/h;

    iput-object p2, p0, LSh/h$a$b;->c:LZh/f;

    iput-object p3, p0, LSh/h$a$b;->d:LSh/h$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic f(LSh/h$a$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LSh/h$a$b;->d:LSh/h$a;

    iget-object v1, p0, LSh/h$a$b;->c:LZh/f;

    iget-object v2, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, LSh/h$a;->g(LZh/f;Ljava/util/ArrayList;)V

    return-void
.end method

.method public b(Ldi/f;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    new-instance v1, Ldi/s;

    invoke-direct {v1, p1}, Ldi/s;-><init>(Ldi/f;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(LZh/b;LZh/f;)V
    .locals 2

    const-string v0, "enumClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    new-instance v1, Ldi/k;

    invoke-direct {v1, p1, p2}, Ldi/k;-><init>(LZh/b;LZh/f;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, LSh/h$a$b;->a:Ljava/util/ArrayList;

    iget-object v1, p0, LSh/h$a$b;->b:LSh/h;

    iget-object v2, p0, LSh/h$a$b;->c:LZh/f;

    invoke-static {v1, v2, p1}, LSh/h;->N(LSh/h;LZh/f;Ljava/lang/Object;)Ldi/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(LZh/b;)LSh/x$a;
    .locals 4

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LSh/h$a$b;->b:LSh/h;

    sget-object v2, LBh/g0;->a:LBh/g0;

    const-string v3, "NO_SOURCE"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v2, v0}, LSh/h;->x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LSh/h$a$b$a;

    invoke-direct {v1, p1, p0, v0}, LSh/h$a$b$a;-><init>(LSh/x$a;LSh/h$a$b;Ljava/util/ArrayList;)V

    return-object v1
.end method
