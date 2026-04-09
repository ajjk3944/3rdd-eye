.class final LM5/a$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO5/c;


# direct methods
.method constructor <init>(LO5/c;)V
    .locals 0

    iput-object p1, p0, LM5/a$g;->a:LO5/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LM5/a$g;->a:LO5/c;

    invoke-virtual {v0}, LO5/c;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM5/a$g;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
