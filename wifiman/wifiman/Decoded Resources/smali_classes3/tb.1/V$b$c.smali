.class final Ltb/V$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/V$b;->a(Ltb/u;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/u;


# direct methods
.method constructor <init>(Ltb/u;)V
    .locals 0

    iput-object p1, p0, Ltb/V$b$c;->a:Ltb/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/N$c;)Ltb/u;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltb/V$b$c;->a:Ltb/u;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltb/N$c;

    invoke-virtual {p0, p1}, Ltb/V$b$c;->a(Ltb/N$c;)Ltb/u;

    move-result-object p1

    return-object p1
.end method
