.class public final synthetic LK9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK9/f;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK9/f;->a:Lmh/l;

    invoke-static {v0}, LK9/g$a;->a(Lmh/l;)LYg/J;

    move-result-object v0

    return-object v0
.end method
