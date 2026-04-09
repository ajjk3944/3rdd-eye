.class public final Ll6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll6/a;->a()Lph/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:LY5/d;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY5/b;

    invoke-virtual {p0, p1, p2}, Ll6/a$a;->c(LY5/b;Lth/l;)LY5/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LY5/b;

    check-cast p3, LY5/d;

    invoke-virtual {p0, p1, p2, p3}, Ll6/a$a;->d(LY5/b;Lth/l;LY5/d;)V

    return-void
.end method

.method public c(LY5/b;Lth/l;)LY5/d;
    .locals 1

    const-string/jumbo v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ll6/a$a;->a:LY5/d;

    return-object p1
.end method

.method public d(LY5/b;Lth/l;LY5/d;)V
    .locals 2

    const-string/jumbo v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ll6/a$a;->a:LY5/d;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Ll6/a$a;->a:LY5/d;

    if-eqz p2, :cond_1

    new-instance v0, Ll6/a$a$a;

    invoke-virtual {p1}, LY5/b;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ll6/a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    :cond_1
    iput-object p3, p0, Ll6/a$a;->a:LY5/d;

    if-eqz p3, :cond_2

    new-instance p2, Ll6/a$a$b;

    invoke-virtual {p1}, LY5/b;->d()Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {p2, p1}, Ll6/a$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    :cond_2
    return-void
.end method
