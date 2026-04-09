.class public final synthetic LUe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LUe/g;


# direct methods
.method public synthetic constructor <init>(LUe/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUe/h;->a:LUe/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LUe/h;->a:LUe/g;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, p1}, LUe/o;->c(LUe/g;Landroid/content/Context;)Lh7/j;

    move-result-object p1

    return-object p1
.end method
