.class final LAb/g$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAb/g;->b(Ljava/lang/String;LEb/o;)Lgg/b;
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

    iput-object p1, p0, LAb/g$h;->a:LAb/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAb/g$h;->a:LAb/g;

    invoke-virtual {v0, p1}, LAb/g;->F(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LAb/g$h;->a(Ljava/lang/Throwable;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
