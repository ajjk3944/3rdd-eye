.class final Ljb/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/g;->r(Lgg/D;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/D;


# direct methods
.method constructor <init>(Lgg/D;)V
    .locals 0

    iput-object p1, p0, Ljb/g$d;->a:Lgg/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/b;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ljb/g$d;->a:Lgg/D;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/b;

    invoke-virtual {p0, p1}, Ljb/g$d;->a(Llb/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
