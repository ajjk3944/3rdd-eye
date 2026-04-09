.class public final synthetic LT9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/login/g;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/login/g;ZLjava/lang/String;Lmh/a;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/h;->a:Lcom/ui/core/ui/sso/login/g;

    iput-boolean p2, p0, LT9/h;->b:Z

    iput-object p3, p0, LT9/h;->c:Ljava/lang/String;

    iput-object p4, p0, LT9/h;->d:Lmh/a;

    iput-boolean p5, p0, LT9/h;->e:Z

    iput p6, p0, LT9/h;->f:I

    iput p7, p0, LT9/h;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LT9/h;->a:Lcom/ui/core/ui/sso/login/g;

    iget-boolean v1, p0, LT9/h;->b:Z

    iget-object v2, p0, LT9/h;->c:Ljava/lang/String;

    iget-object v3, p0, LT9/h;->d:Lmh/a;

    iget-boolean v4, p0, LT9/h;->e:Z

    iget v5, p0, LT9/h;->f:I

    iget v6, p0, LT9/h;->g:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LT9/j;->c(Lcom/ui/core/ui/sso/login/g;ZLjava/lang/String;Lmh/a;ZIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
