.class public final synthetic LAb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LAb/g;


# direct methods
.method public synthetic constructor <init>(LAb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAb/e;->a:LAb/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAb/e;->a:LAb/g;

    invoke-static {v0}, LAb/g;->u(LAb/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
