.class final Lw7/e$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw7/e$b;->a()Lu7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw7/e$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/e$b$a;

    invoke-direct {v0}, Lw7/e$b$a;-><init>()V

    sput-object v0, Lw7/e$b$a;->a:Lw7/e$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls7/g;)Ljava/lang/Long;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls7/g;

    invoke-virtual {p0, p1}, Lw7/e$b$a;->a(Ls7/g;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
