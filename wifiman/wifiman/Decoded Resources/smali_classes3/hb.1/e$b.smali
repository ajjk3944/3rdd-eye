.class final Lhb/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/e;->c(Ljava/lang/String;Leb/k;ZJ)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Leb/k;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Leb/k;Z)V
    .locals 0

    iput-object p1, p0, Lhb/e$b;->a:Leb/k;

    iput-boolean p2, p0, Lhb/e$b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/f;)Lhb/h;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb/h;

    iget-object v1, p0, Lhb/e$b;->a:Leb/k;

    iget-boolean v2, p0, Lhb/e$b;->b:Z

    invoke-direct {v0, p1, v1, v2}, Lhb/h;-><init>(Ltb/f;Leb/k;Z)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltb/f;

    invoke-virtual {p0, p1}, Lhb/e$b;->a(Ltb/f;)Lhb/h;

    move-result-object p1

    return-object p1
.end method
