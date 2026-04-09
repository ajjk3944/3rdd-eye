.class public final synthetic LAb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:LAb/g;


# direct methods
.method public synthetic constructor <init>(LAb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAb/f;->a:LAb/g;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LAb/f;->a:LAb/g;

    invoke-static {v0}, LAb/g;->v(LAb/g;)Lgg/f;

    move-result-object v0

    return-object v0
.end method
