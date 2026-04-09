.class final Lvb/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvb/c;->a(Lgg/z;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvb/c;


# direct methods
.method constructor <init>(Lvb/c;)V
    .locals 0

    iput-object p1, p0, Lvb/c$a;->a:Lvb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lvb/c$a;->a:Lvb/c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lvb/c;->c(Lvb/c;Lgg/z;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lvb/c$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
