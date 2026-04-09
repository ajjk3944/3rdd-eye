.class final LM8/b$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b$k;->a(Lxf/b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$k$a;

    invoke-direct {v0}, LM8/b$k$a;-><init>()V

    sput-object v0, LM8/b$k$a;->a:LM8/b$k$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lxf/b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lxf/b$a;->a:Lxf/b$a;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LM8/b$k$a;->a(Ljava/lang/Long;)Lxf/b;

    move-result-object p1

    return-object p1
.end method
