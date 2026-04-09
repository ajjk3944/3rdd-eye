.class public final synthetic LE8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LE8/x;


# direct methods
.method public synthetic constructor <init>(LE8/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/v;->a:LE8/x;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE8/v;->a:LE8/x;

    invoke-static {v0}, LE8/x;->w0(LE8/x;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
