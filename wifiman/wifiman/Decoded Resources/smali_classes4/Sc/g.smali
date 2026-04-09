.class public final synthetic LSc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LSc/e;


# direct methods
.method public synthetic constructor <init>(LSc/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSc/g;->a:LSc/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSc/g;->a:LSc/e;

    check-cast p1, Lt7/e;

    invoke-static {v0, p1}, LSc/e$c;->b(LSc/e;Lt7/e;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
