.class public final synthetic Laa/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Laa/f;

.field public final synthetic b:LEb/w;


# direct methods
.method public synthetic constructor <init>(Laa/f;LEb/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e;->a:Laa/f;

    iput-object p2, p0, Laa/e;->b:LEb/w;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Laa/e;->a:Laa/f;

    iget-object v1, p0, Laa/e;->b:LEb/w;

    invoke-static {v0, v1}, Laa/f;->m0(Laa/f;LEb/w;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
