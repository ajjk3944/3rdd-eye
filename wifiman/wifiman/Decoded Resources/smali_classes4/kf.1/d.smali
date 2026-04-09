.class public final synthetic Lkf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lkf/b;


# direct methods
.method public synthetic constructor <init>(Lkf/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkf/d;->a:Lkf/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkf/d;->a:Lkf/b;

    invoke-static {v0}, Lkf/f$a;->b(Lkf/b;)LYg/J;

    move-result-object v0

    return-object v0
.end method
