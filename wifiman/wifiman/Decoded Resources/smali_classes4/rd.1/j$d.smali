.class final Lrd/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;-><init>(LZc/f;Lmc/a;Lld/b;Lvc/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/j$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$d;

    invoke-direct {v0}, Lrd/j$d;-><init>()V

    sput-object v0, Lrd/j$d;->a:Lrd/j$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrd/a$a;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrd/a$a$b$c;

    if-eqz v0, :cond_0

    check-cast p1, Lrd/a$a$b$c;

    invoke-virtual {p1}, Lrd/a$a$b$c;->a()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrd/a$a;

    invoke-virtual {p0, p1}, Lrd/j$d;->a(Lrd/a$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
