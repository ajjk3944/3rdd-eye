.class public final synthetic LI7/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/i0;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI7/i0;->a:Lmh/l;

    invoke-static {v0, p1}, LI7/P$y$d;->r(Lmh/l;Ljava/lang/Object;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
