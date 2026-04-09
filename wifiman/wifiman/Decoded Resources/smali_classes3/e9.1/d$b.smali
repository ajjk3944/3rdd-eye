.class final Le9/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/d;-><init>(LT8/d;Le9/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Le9/d;


# direct methods
.method constructor <init>(Le9/d;)V
    .locals 0

    iput-object p1, p0, Le9/d$b;->a:Le9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Le9/c$b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/d$b;->a:Le9/d;

    invoke-static {v0}, Le9/d;->a(Le9/d;)Le9/c;

    move-result-object v0

    invoke-interface {v0, p1}, Le9/c;->a([B)Le9/c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT8/d$a;

    invoke-virtual {p1}, LT8/d$a;->f()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Le9/d$b;->a([B)Le9/c$b;

    move-result-object p1

    return-object p1
.end method
