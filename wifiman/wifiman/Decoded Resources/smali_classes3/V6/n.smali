.class public final synthetic LV6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LV6/b;


# direct methods
.method public synthetic constructor <init>(LV6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/n;->a:LV6/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV6/n;->a:LV6/b;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LV6/m$d$a;->o(LV6/b;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
