.class final Ld/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a;->a(ZLmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/a$d;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Ld/a$d;Z)V
    .locals 0

    iput-object p1, p0, Ld/a$a;->a:Ld/a$d;

    iput-boolean p2, p0, Ld/a$a;->b:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ld/a$a;->a:Ld/a$d;

    iget-boolean v1, p0, Ld/a$a;->b:Z

    invoke-virtual {v0, v1}, Lc/F;->j(Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld/a$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
