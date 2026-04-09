.class final Lv8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/b;-><init>(LSd/d;Lde/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lv8/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/b$e;

    invoke-direct {v0}, Lv8/b$e;-><init>()V

    sput-object v0, Lv8/b$e;->a:Lv8/b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSd/d$b;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LSd/d$b;->a()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->f()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v1

    :cond_1
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lv8/b$e;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
