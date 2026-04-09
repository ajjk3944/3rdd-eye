.class public final synthetic LUe/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LUe/g;

.field public final synthetic b:LT/q0;


# direct methods
.method public synthetic constructor <init>(LUe/g;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe/i;->a:LUe/g;

    iput-object p2, p0, LUe/i;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LUe/i;->a:LUe/g;

    iget-object v1, p0, LUe/i;->b:LT/q0;

    check-cast p1, Lh7/j;

    invoke-static {v0, v1, p1}, LUe/o;->e(LUe/g;LT/q0;Lh7/j;)LYg/J;

    move-result-object p1

    return-object p1
.end method
