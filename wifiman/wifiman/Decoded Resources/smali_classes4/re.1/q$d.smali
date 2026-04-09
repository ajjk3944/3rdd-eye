.class final Lre/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/q;-><init>(Lcom/ui/wmw/g;Lre/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lre/q$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/q$d;

    invoke-direct {v0}, Lre/q$d;-><init>()V

    sput-object v0, Lre/q$d;->a:Lre/q$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;Ljava/util/Set;)LYg/s;
    .locals 1

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, Ljava/util/Set;

    invoke-virtual {p0, p1, p2}, Lre/q$d;->a(LYg/s;Ljava/util/Set;)LYg/s;

    move-result-object p1

    return-object p1
.end method
