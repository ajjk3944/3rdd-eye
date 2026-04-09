.class public final LJ/j$D;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->C0(Ll0/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;

.field final synthetic b:LJ/n;

.field final synthetic c:LJ/j;


# direct methods
.method public constructor <init>(LJ/j;LJ/n;LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/j$D;->a:LJ/j;

    iput-object p2, p0, LJ/j$D;->b:LJ/n;

    iput-object p3, p0, LJ/j$D;->c:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LJ/j$D;->c:LJ/j;

    invoke-virtual {v0}, LJ/j;->H()V

    iget-object v0, p0, LJ/j$D;->a:LJ/j;

    iget-object v1, p0, LJ/j$D;->b:LJ/n;

    invoke-virtual {v0, v1}, LJ/j;->I0(LJ/n;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ/j$D;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
