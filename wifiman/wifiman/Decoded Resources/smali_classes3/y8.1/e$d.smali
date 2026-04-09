.class final Ly8/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(Lre/a;Lje/u;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/e$d;

    invoke-direct {v0}, Ly8/e$d;-><init>()V

    sput-object v0, Ly8/e$d;->a:Ly8/e$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    instance-of v1, p1, Lje/r$b$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lje/r$b$a;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v2

    :cond_1
    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Ly8/e$d;->a(Lje/r;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
