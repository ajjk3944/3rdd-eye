.class public final synthetic Lxa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lxa/f;


# direct methods
.method public synthetic constructor <init>(Lxa/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/c;->a:Lxa/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxa/c;->a:Lxa/f;

    invoke-static {v0}, Lxa/f;->j(Lxa/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
