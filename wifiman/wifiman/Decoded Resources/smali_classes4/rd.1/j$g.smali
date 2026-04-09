.class final Lrd/j$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;->n()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/j$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$g;

    invoke-direct {v0}, Lrd/j$g;-><init>()V

    sput-object v0, Lrd/j$g;->a:Lrd/j$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LJa/a;
    .locals 3

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LJa/a;->a:LJa/a$a;

    new-instance v0, LJa/a$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJa/a$b;-><init>(ZZ)V

    invoke-virtual {p1, v0}, LJa/a$a;->a(LJa/a$b;)LJa/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lrd/j$g;->a(Ljava/lang/Long;)LJa/a;

    move-result-object p1

    return-object p1
.end method
