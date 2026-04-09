.class public final LJ/l$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/l$a;->a(Lv/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv/i;

.field final synthetic b:LJ/j;


# direct methods
.method public constructor <init>(Lv/i;LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/l$a$c;->a:Lv/i;

    iput-object p2, p0, LJ/l$a$c;->b:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LJ/l$a$c;->b:LJ/j;

    invoke-virtual {v0}, LJ/j;->o0()V

    iget-object v0, p0, LJ/l$a$c;->a:Lv/i;

    invoke-static {v0}, Lv/j;->a(Lv/i;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ/l$a$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
