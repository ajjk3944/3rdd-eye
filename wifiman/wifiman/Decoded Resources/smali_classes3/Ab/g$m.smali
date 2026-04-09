.class final LAb/g$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAb/g;->K(Ljava/lang/String;Ljava/lang/String;Z)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAb/g;


# direct methods
.method constructor <init>(LAb/g;)V
    .locals 0

    iput-object p1, p0, LAb/g$m;->a:LAb/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LAb/g$m;->a:LAb/g;

    invoke-static {p1}, LAb/g;->A(LAb/g;)LAb/i;

    move-result-object p1

    invoke-interface {p1}, LAb/i;->g()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LAb/g$m;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
