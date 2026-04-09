.class public final synthetic Lya/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lya/m;


# direct methods
.method public synthetic constructor <init>(Lya/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/i;->a:Lya/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lya/i;->a:Lya/m;

    invoke-static {v0}, Lya/m;->g(Lya/m;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
