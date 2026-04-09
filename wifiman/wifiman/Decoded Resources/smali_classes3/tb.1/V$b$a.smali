.class final Ltb/V$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/V$b;->a(Ltb/u;)Lgg/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltb/V$b$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/N$c;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltb/V;->a:Ltb/V;

    iget-object v1, p0, Ltb/V$b$a;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Ltb/V;->e(Ltb/V;Ljava/lang/String;Ltb/N$c;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ltb/N$c;

    invoke-virtual {p0, p1}, Ltb/V$b$a;->a(Ltb/N$c;)V

    return-void
.end method
