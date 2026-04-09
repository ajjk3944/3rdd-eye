.class public final synthetic Lea/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lea/e;


# direct methods
.method public synthetic constructor <init>(Lea/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/b;->a:Lea/e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lea/b;->a:Lea/e;

    invoke-static {v0}, Lea/d;->a(Lea/e;)LYg/J;

    move-result-object v0

    return-object v0
.end method
