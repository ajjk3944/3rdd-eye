.class public final synthetic Luf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Luf/a;


# direct methods
.method public synthetic constructor <init>(Luf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf/c;->a:Luf/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luf/c;->a:Luf/a;

    invoke-static {v0}, Luf/e;->b(Luf/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
