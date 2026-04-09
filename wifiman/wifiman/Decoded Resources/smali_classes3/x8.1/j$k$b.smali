.class final Lx8/j$k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j$k;->a(LYg/y;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$k$b;

    invoke-direct {v0}, Lx8/j$k$b;-><init>()V

    sput-object v0, Lx8/j$k$b;->a:Lx8/j$k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEe/g$a$a;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEe/g$a$a;

    invoke-virtual {p0, p1}, Lx8/j$k$b;->a(LEe/g$a$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
