.class public final Landroidx/compose/ui/platform/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/ClipData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/f0;->a:Landroid/content/ClipData;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/f0;->a:Landroid/content/ClipData;

    return-object v0
.end method
