.class public final synthetic Lxa/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lwa/a;


# direct methods
.method public synthetic constructor <init>(Lwa/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/l;->a:Lwa/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxa/l;->a:Lwa/a;

    invoke-static {v0}, Lxa/j$d;->n(Lwa/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
