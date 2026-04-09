.class final Llc/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llc/g;->a(Llc/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Llc/a;


# direct methods
.method constructor <init>(Llc/a;)V
    .locals 0

    iput-object p1, p0, Llc/g$b;->a:Llc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llc/c;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llc/g$b;->a:Llc/a;

    invoke-virtual {v0}, Llc/a;->a()I

    move-result v0

    invoke-virtual {p1}, Llc/c;->b()I

    move-result p1

    invoke-static {v0, p1}, Llc/b;->b(II)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Llc/c;

    invoke-virtual {p0, p1}, Llc/g$b;->a(Llc/c;)Z

    move-result p1

    return p1
.end method
