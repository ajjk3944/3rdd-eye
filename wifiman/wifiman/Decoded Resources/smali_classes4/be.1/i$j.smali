.class final Lbe/i$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbe/i;->n(Lbe/c$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbe/c;


# direct methods
.method constructor <init>(Lbe/c;)V
    .locals 0

    iput-object p1, p0, Lbe/i$j;->a:Lbe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lce/b;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll9/a;

    iget-object v0, p0, Lbe/i$j;->a:Lbe/c;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/b;

    invoke-virtual {p0, p1}, Lbe/i$j;->a(Lce/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
