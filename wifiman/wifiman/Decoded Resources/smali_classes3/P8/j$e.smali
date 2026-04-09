.class final LP8/j$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/j$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/j$e;

    invoke-direct {v0}, LP8/j$e;-><init>()V

    sput-object v0, LP8/j$e;->a:LP8/j$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lcom/ui/wifiman/model/wmw/g$c;)Lcom/ui/wifiman/model/wmw/g$c;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1, p2}, LP8/j$e;->a(Ll9/a;Lcom/ui/wifiman/model/wmw/g$c;)Lcom/ui/wifiman/model/wmw/g$c;

    move-result-object p1

    return-object p1
.end method
