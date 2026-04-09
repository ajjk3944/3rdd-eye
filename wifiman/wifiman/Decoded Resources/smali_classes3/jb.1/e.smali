.class public final synthetic Ljb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljb/g;


# direct methods
.method public synthetic constructor <init>(Ljb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/e;->a:Ljb/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljb/e;->a:Ljb/g;

    invoke-static {v0}, Ljb/g;->c(Ljb/g;)LYg/J;

    move-result-object v0

    return-object v0
.end method
