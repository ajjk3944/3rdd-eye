.class public final synthetic Ljb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Ljb/m;


# direct methods
.method public synthetic constructor <init>(Ljb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/l;->a:Ljb/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljb/l;->a:Ljb/m;

    invoke-static {v0}, Ljb/m;->c(Ljb/m;)Lgg/z;

    move-result-object v0

    return-object v0
.end method
